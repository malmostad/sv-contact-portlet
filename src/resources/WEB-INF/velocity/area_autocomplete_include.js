<script type="text/javascript">
//<![CDATA[
jQuery(document).ready(function($){areaSearch("#contact-area-search","#contact-district","#contact-district-selector-form");function areaSearch(inputId,selectId,formId){$(inputId).autocomplete({minLength:2,source:function(request,response){$.ajax({url:"/kontaktruta/searchareas.do",dataType:"json",data:"query="+encodeURIComponent(request.term),success:function(data){response($.map(data.suggestions,function(item,i){return{label:item,value:data.data[i]};}));}});},select:function(event,ui){$(inputId).val(ui.item.label);$(selectId).val(ui.item.value);$(formId).submit();return false;},focus:function(event,ui){$(inputId).val(ui.item.label);return false;}});}});
//]]>
</script>
