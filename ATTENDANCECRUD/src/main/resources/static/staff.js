function submit()
{
	var title=document.getElementById("title").value;
	alert(title);
		var assignment=document.getElementById("assignment").value;
	alert(assignment);
	var student=document.getElementById("student").value;
	alert(student);
	var mark=document.getElementById("marks").value;
	alert(mark);
	var remark=document.getElementById("remarks").value;
	alert(remark);
$.ajax({ 
        type: "POST",
        dataType: "json",
        contentType: "application/json",
        url: "http://localhost:3000/staff",
         data: JSON.stringify({

            "subjects": title,  
            "assignments": assignment,
            "studentName": student,  
            "marksobtained": mark,
            "remark": remark,
            }),
            async: false,
        success: function(data){ 
	   alert("success");
	        }
    });
	
}
