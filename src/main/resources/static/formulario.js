
//FUNCIONALIDAD DE DEVOLVER LA PERSONA GUARDADA POR PANTALLA 
function getPersona(){

  var raw= JSON.stringify({ 
    NOMBRE: document.getElementById("NOMBRE").value, 
    APELLIDOS: document.getElementById("APELLIDOS").value,
    EMAIL: document.getElementById("EMAIL").value,
    TELEFONO: document.getElementById("TELEFONO").value }
    );
  
  alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
  
  fetch('http://localhost:8888/api/info',
   {
    headers: {
      "Content-Type": "application/json"
    },
     method: "POST",
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
    .then((data) => {
      window.location.replace("./index.html");
    })
    .catch((error) => {
      console.log(error);
    });
  };


  //CREATE persona  ---- POST
  function createPersona(){

    var raw= JSON.stringify({ 
      NOMBRE: document.getElementById("NOMBRE").value, 
      APELLIDOS: document.getElementById("APELLIDOS").value,
      EMAIL: document.getElementById("EMAIL").value,
      TELEFONO: document.getElementById("TELEFONO").value }
      );
    
    alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
    
    fetch('http://localhost:8888/api/crearpersona',
     {
      headers: {
        "Content-Type": "application/json"
      },
       method: "POST",
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
      });
    };


    //UPDATE Persona --- PUT
    function updatePersona(){

      var raw= JSON.stringify({ 
        ID: document.getElementById("ID").value, 
        NOMBRE: document.getElementById("NOMBRE").value, 
        APELLIDOS: document.getElementById("APELLIDOS").value,
        EMAIL: document.getElementById("EMAIL").value,
        TELEFONO: document.getElementById("TELEFONO").value }
        );
      
      alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
      
      fetch('http://localhost:8888/api/info',
       {
        headers: {
          "Content-Type": "application/json"
        },
         method: "PUT",
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
        });
      };


      //SEARCH PERSONA --- GET
      function searchPersona(){

        var raw= JSON.stringify({ 
          NOMBRE: document.getElementById("NOMBRE").value, 
          APELLIDOS: document.getElementById("APELLIDOS").value,
          EMAIL: document.getElementById("EMAIL").value,
          TELEFONO: document.getElementById("TELEFONO").value }
          );
        
        alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
        
        fetch('http://localhost:8888/persona/{id}',
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
          .then((data) => {
            window.location.replace("./index.html");
          })
          .catch((error) => {
            console.log(error);
          });
        };


        //DELETE PERSONA  ---- DELETE

        function deletePersona(){

          var raw= JSON.stringify({ 
            NOMBRE: document.getElementById("NOMBRE").value, 
            APELLIDOS: document.getElementById("APELLIDOS").value,
            EMAIL: document.getElementById("EMAIL").value,
            TELEFONO: document.getElementById("TELEFONO").value }
            );
          
          alert("SE HAN GUARDADO CORRECTAMENTE LOS SIGUIENTES DATOS:" + raw );
          
          fetch('http://localhost:8888/api/info',
           {
            headers: {
              "Content-Type": "application/json"
            },
             method: "DELETE",
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
            });
          };
    
  








  