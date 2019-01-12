
//2.清空操作记录;
function deleteAction(){
	console.log("deleteAction..");
	var url="delete.do";
	var data={};
	$.getJSON(url,data,function(result){
		if(result.state==0){
			selectAction();
		}else{
			alert(result.message);
		}
	});	
}

//1.查询操作记录;
function selectAction(){	
	console.log("进入selectAction");
	var url="list.do";
	var data={};
	$.post(url,data,function(result){
		if(result.state==0){
			//console.log("返回结果成功");
			var list= result.data;
			var table= $("#table");
			table.empty();
			table.append(aaa);
			for(var i=0;i<list.length;i++){
				var res= list[i];
				var tr= resTemplate.replace("[id]",res.id);
				tr= tr.replace("[num]",res.num);
				tr= tr.replace("[result]", res.result);
				tr= tr.replace("[date]",res.date);
				table.append(tr);
			}
		}else{
			alert(result.message);
		}
	});
}
var aaa='<tr>'+
		'<td>ID</td>'+
		'<td>数字输入</td>'+
		'<td>判断结果</td>'+
		'<td>操作时间</td>'+
		'</tr>';
var resTemplate=
	'<tr>'+
      '<td>[id]</td>'+
      '<td>[num]</td>'+
      '<td>[result]</td>'+
      '<td>[date]</td>'+
    '</tr>';
      
      