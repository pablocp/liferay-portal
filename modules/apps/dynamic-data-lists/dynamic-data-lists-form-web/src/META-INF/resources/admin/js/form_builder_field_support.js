AUI.add(
	'liferay-ddl-form-builder-field-support',
	function(A) {
		var FieldTypes = Liferay.DDM.Renderer.FieldTypes;

		var CSS_FIELD = A.getClassName('form', 'builder', 'field');

		var CSS_FIELD_CONTENT_TOOLBAR = A.getClassName('form', 'builder', 'field', 'content', 'toolbar');

		var CSS_FIELD_REPEATABLE_TOOLBAR = A.getClassName('lfr', 'ddm', 'form', 'field', 'repeatable', 'toolbar');

		var CSS_FIELD_SETTINGS_CANCEL = A.getClassName('form', 'builder', 'field', 'settings', 'cancel');

		var CSS_FIELD_TOOLBAR_CONTAINER = A.getClassName('form', 'builder', 'field', 'toolbar', 'container');

		var CSS_FORM_GROUP = A.getClassName('form', 'group');

		var TPL_SETTINGS_FORM = '<form action="javascript:;"><button class="hide" type="submit" /></form>';

		var FormBuilderFieldSupport = function() {
		};

		FormBuilderFieldSupport.ATTRS = {
			builder: {
				value: null
			},

			content: {
				getter: function() {
					var instance = this;

					return instance.get('container');
				}
			},

			settingsForm: {
				valueFn: '_valueSettingsForm'
			}
		};

		FormBuilderFieldSupport.prototype = {
			initializer: function() {
				var instance = this;

				instance.settingsLoader = A.Node.create('<div class="hide loading-animation"></div>');

				instance._eventHandlers.push(
					instance.after(instance._renderFormBuilderField, instance, 'render')
				);
			},

			destructor: function() {
				var instance = this;

				instance.get('settingsForm').destroy();
			},

			getSettings: function() {
				var instance = this;

				var settings = {};

				var settingsForm = instance.get('settingsForm');

				var fieldSettingsJSON = settingsForm.toJSON();

				fieldSettingsJSON.fieldValues.forEach(
					function(item) {
						settings[item.name] = item.value;
					}
				);

				settings.type = instance.get('type');

				return settings;
			},

			getSettingsModal: function() {
				var instance = this;

				var builder = instance.get('builder');

				return builder._fieldSettingsModal;
			},

			hideSettingsLoader: function() {
				var instance = this;

				instance.settingsLoader.hide();
			},

			renderSettingsPanel: function() {
				var instance = this;

				var footerNode = instance._getModalStdModeNode(A.WidgetStdMod.FOOTER);

				var cancelButton = footerNode.one('.' + CSS_FIELD_SETTINGS_CANCEL);

				cancelButton.insert(instance.settingsLoader, 'after');

				instance._renderFormNode();

				instance._updateSettingsFormValues();

				var settingsForm = instance.get('settingsForm');

				settingsForm.clearValidationMessages();
				settingsForm.clearValidationStatus();
			},

			saveSettings: function() {
				var instance = this;

				instance.setAttrs(instance.getSettings());

				instance.render();

				instance.fire(
					'field:saveSettings',
					{
						field: instance
					}
				);
			},

			showSettingsLoader: function() {
				var instance = this;

				instance.settingsLoader.show();
			},

			validateSettings: function(callback) {
				var instance = this;

				var settingsForm = instance.get('settingsForm');

				instance.showSettingsLoader();

				settingsForm.clearValidationMessages();
				settingsForm.clearValidationStatus();

				settingsForm.validate(A.bind('_afterValidateSettingsForm', instance, callback));

				return false;
			},

			_afterValidateSettingsForm: function(callback, hasErrors) {
				var instance = this;

				var builder = instance.get('builder');

				var settingsForm = instance.get('settingsForm');

				var nameSettingsField = settingsForm.getField('name');

				var field = builder.getField(nameSettingsField.getValue());

				if (!!field && field !== instance) {
					nameSettingsField.addValidationMessage('Field name already in use.');
					nameSettingsField.showValidationStatus();

					nameSettingsField.focus();

					hasErrors = true;
				}

				if (!hasErrors) {
					var settingsModal = instance.getSettingsModal();

					instance.saveSettings();

					settingsModal.fire(
						'save',
						{
							field: instance
						}
					);

					settingsModal.hide();
				}

				instance.hideSettingsLoader();

				if (callback) {
					callback.call(instance, hasErrors);
				}
			},

			_getModalStdModeNode: function(mode) {
				var instance = this;

				var settingsModal = instance.getSettingsModal();

				return settingsModal._modal.getStdModNode(mode);
			},

			_renderFormBuilderField: function() {
				var instance = this;

				var container = instance.get('container');

				container.addClass(CSS_FIELD);

				container.setData('field-instance', instance);

				var wrapper = container.one('.' + CSS_FORM_GROUP);

				wrapper.append('<div class="' + CSS_FIELD_TOOLBAR_CONTAINER + '"></div>');

				wrapper.addClass(CSS_FIELD_CONTENT_TOOLBAR);

				if (instance.get('repeatable')) {
					var toolbar = container.one('.' + CSS_FIELD_REPEATABLE_TOOLBAR);

					if (toolbar) {
						toolbar.hide();
					}
				}
			},

			_renderFormNode: function() {
				var instance = this;

				var settingsFormNode = A.Node.create(TPL_SETTINGS_FORM);

				var settingsForm = instance.get('settingsForm');

				settingsForm.set('container', settingsFormNode);

				var bodyNode = instance._getModalStdModeNode(A.WidgetStdMod.BODY);

				settingsFormNode.appendTo(bodyNode);

				var formName = A.guid();

				settingsFormNode.attr('id', formName);
				settingsFormNode.attr('name', formName);

				Liferay.Form.register(
					{
						id: formName
					}
				);

				var settingsModal = instance.getSettingsModal();

				settingsFormNode.on('submit', A.bind('_save', settingsModal));
			},

			_updateSettingsFormValues: function() {
				var instance = this;

				var settingsForm = instance.get('settingsForm');

				settingsForm.get('fields').forEach(
					function(item, index) {
						item.set('value', instance.get(item.get('name')));
					}
				);
			},

			_valueSettingsForm: function() {
				var instance = this;

				var fieldType = FieldTypes.get(instance.get('type'));

				return new Liferay.DDM.Renderer.Form(
					{
						definition: fieldType.get('settings'),
						portletNamespace: instance.get('portletNamespace')
					}
				);
			}
		};

		Liferay.namespace('DDL').FormBuilderFieldSupport = FormBuilderFieldSupport;
	},
	'',
	{
		requires: ['liferay-ddm-form-field-checkbox-template', 'liferay-ddm-form-field-options-template', 'liferay-ddm-form-field-radio-template', 'liferay-ddm-form-field-select-template', 'liferay-ddm-form-field-text-template', 'liferay-ddm-form-field-types', 'liferay-ddm-form-renderer', 'liferay-ddm-form-renderer-field']
	}
);