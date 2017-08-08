 window.onload = function(){
    document.getElementById("form").reset();
    document.getElementById("myDropdown").selectedIndex=-1;
}
  function linkhref(){
  document.getElementById('home').href="HTMLAssignment1.htm";
  document.getElementById('about').href="home.html";
  document.getElementById('product').href="home.html";
  document.getElementById('gallery').href="home.html";
  document.getElementById('linkJs').href="linkJs.html";
  }
  function validate(){
	var regex1= /^(([\-\w]+)\.?)+@(([\-\w]+)\.?)+\.[a-zA-Z]{2,4}$/;
	var regex2=/^[a-zA-Z]+$/
  
         if( document.myForm.name.value.length < 1 || document.myForm.name.value.length > 20 || !(regex2.test(document.myForm.name.value)))
         {
            //alert( "Please provide your name!" );
            document.myForm.name.focus() ;
			document.getElementById("name").style.borderColor="red";
		    return false;
         }
		 else{
		 document.getElementById("name").style.borderColor="blue";
		 }
         
         if( document.myForm.email.value.length < 1 || !(regex1.test(document.myForm.email.value)))
         {
           document.getElementById("email").style.borderColor="red";
            document.myForm.email.focus() ;
            return false;
         }
		 else{
			document.getElementById("email").style.borderColor="blue";
		 }
		 if( document.myForm.organisation.value.length < 1 )
         {
    		document.getElementById("organisation").style.borderColor="red";
            return false;
         }
		  else{
			document.getElementById("organisation").style.borderColor="blue";
		 }
         
         if( isNaN( document.myForm.contact.value ) ||
         document.myForm.contact.value.length < 5 || document.myForm.contact.value.length > 12 )
         {	document.getElementById("contact").style.borderColor="red";
           document.myForm.contact.focus() ;
            return false;
         }
		  else{
			document.getElementById("contact").style.borderColor="blue";
		 }
         
         
		 if( document.myForm.message.value.length>250 || document.myForm.message.value.length < 1  )
         {
        	document.getElementById("message").style.borderColor="red";
            return false;
         }
		   else{
			document.getElementById("message").style.borderColor="blue";
		 }
         return true ;
		 
			 }
			 function messageFunction(){
			 if(validate()){
			  document.getElementById("submit1").innerHTML = "Thanks for contacting us";
			  document.getElementById("form").reset();
			 }
			 
			 }
		

		function desc(){
			 document.getElementById("desc1").value = "selected city is " + document.myForm.city.value ;
			 }
