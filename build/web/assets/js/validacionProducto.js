$(document).ready(function(){
    // $('#formulario').addClass('formulario');
    $(".NOSE").addClass('ocultar');
    $(".NOSE2").addClass('ocultar');
    $(".NOSE3").addClass('ocultar');
     $(".NOSE4").addClass('ocultar');
     $(".NOSE5").addClass('ocultar');
     $(".NOSE6").addClass('ocultar');
     $(".NOSE7").addClass('ocultar');
     $(".NOSE8").addClass('ocultar');
$("#miBoton").click(function()
     
{      
	if($("#IDCODIGODEBARRAS").val() == ""){
        $(".NOSE").addClass('mostrar');
        $("#IDCODIGODEBARRAS").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDCODIGODEBARRAS").click(function(){
          $("#IDCODIGODEBARRAS").removeClass('resaltar');
         $(".NOSE").removeClass('mostrar')}); 
           
      
            










     }
         $(".NOSE").removeClass('resaltar');
          $(".NOSE").addClass('ocultar');

     	if($("#IDDESCRIPCION").val() == ""){
        $(".NOSE2").addClass('mostrar');
        $("#IDDESCRIPCION").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDDESCRIPCION").click(function(){
          $("#IDDESCRIPCION").removeClass('resaltar');
         $(".NOSE2").removeClass('mostrar')}); 
         


     
   };     
          $(".NOSE2").removeClass('resaltar');
          $(".NOSE2").addClass('ocultar');

          if($("#IDPRECIOCOMPRA").val() == ""){
        $(".NOSE3").addClass('mostrar');
        $("#IDPRECIOCOMPRA").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDPRECIOCOMPRA").click(function(){
          $("#IDPRECIOCOMPRA").removeClass('resaltar');
         $(".NOSE3").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE3").removeClass('resaltar');
          $(".NOSE3").addClass('ocultar');
         
            
        if($("#IDPRECIOCOMPRA").val() == ""){
        $(".NOSE3").addClass('mostrar');
        $("#PRECIOCOMPRA").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDPRECIOCOMPRA").click(function(){
          $("#IDPRECIOCOMPRA").removeClass('resaltar');
         $(".NOSE3").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE3").removeClass('resaltar');
          $(".NOSE3").addClass('ocultar');
         
         if($("#IDPORCENTAJEDEGANANCIAS").val() == ""){
        $(".NOSE4").addClass('mostrar');
        $("#IDPORCENTAJEDEGANANCIAS").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDPORCENTAJEDEGANANCIAS").click(function(){
          $("#IDPORCENTAJEDEGANANCIAS").removeClass('resaltar');
         $(".NOSE4").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE4").removeClass('resaltar');
          $(".NOSE4").addClass('ocultar');


           if($("#IDPRECIODEVENTA").val() == ""){
        $(".NOSE5").addClass('mostrar');
        $("#IDPRECIODEVENTA").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        $("#IDPRECIODEVENTA").click(function(){
          $("#IDPRECIODEVENTA").removeClass('resaltar');
         $(".NOSE5").removeClass('mostrar')}); 
         


     
   			}


         $(".NOSE5").removeClass('resaltar');
          $(".NOSE5").addClass('ocultar');


           if($("#IDPORCENTAJE2PRECIO").val()==""){
        		$(".NOSE6").addClass('mostrar');
        		$("#IDPORCENTAJE2PRECIO").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        	$("#IDPORCENTAJE2PRECIO").click(function(){
          	$("#IDPORCENTAJE2PRECIO").removeClass('resaltar');
         	$(".NOSE6").removeClass('mostrar')}); 
         


     
   			}

         
           
          
           
          
            $(".NOSE6").removeClass('resaltar');
            $(".NOSE6").addClass('ocultar');
            
             if($("#IDPRECIODEVENTA2").val()==""){
        		$(".NOSE7").addClass('mostrar');
        		$("#IDPRECIODEVENTA2").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        	$("#IDPRECIODEVENTA2").click(function(){
          	$("#IDPRECIODEVENTA2").removeClass('resaltar');
         	$(".NOSE7").removeClass('mostrar')}); 
         


     
   			}

         
           
          
           
          
            $(".NOSE7").removeClass('resaltar');
            $(".NOSE7").addClass('ocultar');
            
            
            
            if($("#IDSTOCKMIN").val()==""){
        		$(".NOSE8").addClass('mostrar');
        		$("#IDSTOCKMIN").addClass('resaltar');       // Esta función coloca el foco de escritura del usuario en el campo Nombre directamente.
       
       
        	$("#IDSTOCKMIN").click(function(){
          	$("#IDSTOCKMIN").removeClass('resaltar');
         	$(".NOSE8").removeClass('mostrar')}); 
         


     
   			}

         
           
          
           
          
            $(".NOSE8").removeClass('resaltar');
            $(".NOSE8").addClass('ocultar');

           
   			 return false;  







         







         }

  

      

   );});

           
       

        
     
    
         

       
        
     
    
         


