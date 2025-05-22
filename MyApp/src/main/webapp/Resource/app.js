/**
 * 
 */

 function validation(){
	 if(document.regForm.textUsername.value=="")
	 {
		 alert("Plese Enter UserName");
		 return false;
		 
	 }
	 if(document.regForm.textPassword.value=="")
	 {
		 alert("Password Is Required");
		 return false;
	 }
	 if(document.regForm.textEmail.value=="")
	 {
		 alert("Enter Email");
		 return false;
	 }
	 
	 if((document.regForm.gender[0].checked==false)&&(document.regForm.gender[1].checked==false))
	 {
		 alert("Plese Select the Gender");
		 return false;
	 }
	 if(document.regForm.age.selectedIndex==0)
	 {
		 alert("Age is note Selected");
		 return false;
		 
	 }
	 if(document.regForm.terms.checked==false)
	 {
		 alert("Accept Terms and condition");
		 return false;
	 }
 }
 