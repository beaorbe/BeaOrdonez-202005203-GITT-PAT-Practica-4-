
//FUNCIONALIDAD DE DEVOLVER LA PERSONA GUARDADA POR PANTALLA 
function createPersona(){

  var raw= JSON.stringify({ 
    NOMBRE: document.getElementById("FIRST_NAME").value,
    APELLIDOS: document.getElementById("LAST_NAME").value,
    EMAIL: document.getElementById("EMAIL").value,
    TELEFONO: document.getElementById("TELEFONO").value }
    );
  
  //alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
  
  fetch('http://localhost:8888/api/create',
   {
    headers: {
      "Content-Type": "application/json"
    },
     method: "POST",
     body: raw
   })
  .then(response => {
      if (res.ok) {

        //alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
        return(console.log(res.text())); 
  
        //return res.text();
       
      } else {
        alert(" NO SE HAN PODIDO GUARDAR LOS DATOS");
        throw new Error("Error petición");
      }
    })
    
    .catch((error) => {
      console.log(error);
    });
  };



      //SEARCH PERSONA --- GET
      function searchPersona(){

        var raw= JSON.stringify({ 
          NOMBRE: document.getElementById("FIRST_NAME").value,
          APELLIDOS: document.getElementById("LAST_NAME").value,
          EMAIL: document.getElementById("EMAIL").value,
          TELEFONO: document.getElementById("TELEFONO").value }
          );
        
        //alert( document.getElementById("NOMBRE").value +"SE ENCUENTRA EN EL SISTEMA");
        
        fetch('http://localhost:8888/api/buscar',
         {
          headers: {
            "Content-Type": "application/json"
          },
           method: "GET",
           body: raw
         })

        .then(response => {
            if (res.ok) {
      
              alert( document.getElementById("NOMBRE").value +" SE ENCUENTRA EN EL SISTEMA");
              return(console.log(res.NOMBRE)); 
              //return res.text();
             
            } else {
              alert( document.getElementById("NOMBRE").value +" NO SE ENCUENTRA EN EL SISTEMA");
              throw new Error("Error petición");
            } 
          })
         
          .catch((error) => {
            console.log(error);
          });S
        };

      