
//FUNCIONALIDAD DE DEVOLVER LA PERSONA GUARDADA POR PANTALLA 
function createPersona(){

  var raw= JSON.stringify({ 
    name: document.getElementById("FIRST_NAME").value,
    surname: document.getElementById("LAST_NAME").value,
    email: document.getElementById("EMAIL").value,
    phone: document.getElementById("TELEFONO").value }
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
      
              return(console.log(res.text())); 
              //return res.text();
             
            } else {
              throw new Error("Error petición");
            } 
          })
         
          .catch((error) => {
            console.log(error);
          });S
        };

      