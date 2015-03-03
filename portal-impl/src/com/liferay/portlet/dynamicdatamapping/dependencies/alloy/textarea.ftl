<#include "../init.ftl">

<@aui["field-wrapper"] data=data>
	<#if readOnly>
		<@aui.input cssClass=cssClass dir=requestedLanguageDir helpMessage=escape(fieldStructure.tip) label=escape(label) name=namespacedFieldName readonly="readonly" type="textarea" value=fieldValue>
			<#if required>
				<@aui.validator name="required" />
			</#if>
		</@aui.input>
	<#else>
		<@aui.input cssClass=cssClass dir=requestedLanguageDir helpMessage=escape(fieldStructure.tip) label=escape(label) name=namespacedFieldName type="textarea" value=fieldValue>
			<#if required>
				<@aui.validator name="required" />
			</#if>
		</@aui.input>
	</#if>

	${fieldStructure.children}
</@>