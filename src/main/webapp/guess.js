/**
 * 
 */
function guessAction(){
	//alert("hello");
	  console.log("num++:"+num);
	//1.获取文本框里填入的数字;
		var num2= $("#num").val().trim();
		console.log("num2:"+num2);
		if(isNaN(num2)){
			//result.innerHTML="请输入正确格式的数字";
			$("#result").html("请输入正确格式的数字");
		}else if(num2==""){
			//result.innerHTML="输入的数字不能为空";
			$("#result").html("输入的数字不能为空");
		}else{
			console.log("进入ajax..");
			console.log("num+2:"+num);
			$.ajax({
				url:"http://localhost:8081/guess.do",
				type:"post",
				data:{"num":num,"num2":num2},
				dataType:"json",
				success:function(result){
					//console.log("结果返回成功!");
					if(result.state==0){
						$("#result").html(result.data);
					}else if(result.state==2){
						$("#result").html(result.message);
					}else{
						$("#result").html("其他错误");
					}
				},
				error:function(){
					alert("返回结果出错");
				}
			});
		}
	
}