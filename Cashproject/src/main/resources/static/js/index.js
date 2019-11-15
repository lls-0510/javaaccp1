function go(modalname,htmlname){
	 $.post("/go",{htmlName:htmlname},function(res){
		 $("."+modalname).html("");
		 var newDiv = $(`<div data-id=${htmlname}  class="tab-pane active">`);
         newDiv.append(res);
         $("."+modalname).html(newDiv);
	 })
}