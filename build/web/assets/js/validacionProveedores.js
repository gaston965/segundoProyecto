$(document).ready(function(){
    // $('#formulario').addClass('formulario');
    $(".NOSE").addClass('ocultar');
    $(".NOSE2").addClass('ocultar');
    $(".NOSE3").addClass('ocultar');
     $(".NOSE4").addClass('ocultar');
     $(".NOSE5").addClass('ocultar');
     $(".NOSE7").addClass('ocultar');
$("#miBoton").click(function()
     
{      
	if($("#IDPROVEEDOR").val() == ""){
        $(".NOSE").addClass('mostrar');
        $("#IDPROVEEDOR").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDPROVEEDOR").click(function(){
          $("#IDPROVEEDOR").removeClass('resaltar');
         $(".NOSE").removeClass('mostrar')}); 
           
      
            










     }
         $(".NOSE").removeClass('resaltar');
          $(".NOSE").addClass('ocultar');

     	if($("#APELLIDOPROVEEDOR").val() == ""){
        $(".NOSE2").addClass('mostrar');
        $("#APELLIDOPROVEEDOR").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#APELLIDOPROVEEDOR").click(function(){
          $("#APELLIDOPROVEEDOR").removeClass('resaltar');
         $(".NOSE2").removeClass('mostrar')}); 
         


     
   };     
          $(".NOSE2").removeClass('resaltar');
          $(".NOSE2").addClass('ocultar');

          if($("#DNIPROVEEDOR").val() == ""){
        $(".NOSE3").addClass('mostrar');
        $("#DNIPROVEEDOR").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#DNIPROVEEDOR").click(function(){
          $("#DNIPROVEEDOR").removeClass('resaltar');
         $(".NOSE3").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE3").removeClass('resaltar');
          $(".NOSE3").addClass('ocultar');
         
            
        if($("#DNI-Proveedor").val() == ""){
        $(".NOSE3").addClass('mostrar');
        $("#DNI-Proveedor").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#DNI-Proveedor").click(function(){
          $("#DNI-Proveedor").removeClass('resaltar');
         $(".NOSE3").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE3").removeClass('resaltar');
          $(".NOSE3").addClass('ocultar');
         
         if($("#DOMICILIOPROVEEDOR").val() == ""){
        $(".NOSE4").addClass('mostrar');
        $("#DOMICILIOPROVEEDOR").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#DOMICILIOPROVEEDOR").click(function(){
          $("#DOMICILIOPROVEEDOR").removeClass('resaltar');
         $(".NOSE4").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE4").removeClass('resaltar');
          $(".NOSE4").addClass('ocultar');


           if($("#TELEFONOPROVEEDOR").val() == ""){
        $(".NOSE5").addClass('mostrar');
        $("#TELEFONOPROVEEDOR").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#TELEFONOPROVEEDOR").click(function(){
          $("#TELEFONOPROVEEDOR").removeClass('resaltar');
         $(".NOSE5").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE5").removeClass('resaltar');
          $(".NOSE5").addClass('ocultar');


           if($("#CORREOPROVEEDOR1").val()==""){
        		$(".NOSE7").addClass('mostrar');
        		$("#CORREOPROVEEDOR1").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        	$("#CORREOPROVEEDOR1").click(function(){
          	$("#CORREOPROVEEDOR1").removeClass('resaltar');
         	$(".NOSE7").removeClass('mostrar')}); 
         


     
   			}

         
           
          
           
          
            $(".NOSE7").removeClass('resaltar');
            $(".NOSE7").addClass('ocultar');

           
   			 return false;  







         







         }

  

      

   );});

           
       

        
     
    
         

       
        
     
    
         


