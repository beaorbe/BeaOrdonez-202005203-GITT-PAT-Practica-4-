var raw = JSON.stringify({
 "name_id" : document.getElementById("name_id"),
 "apellido_id" : document.getElementbyId("apellido_id"),
 "email_id" : document.getElementbyId("email_id"),
 "phone_id" : document.getElementbyId("phone_id")
})

function getPersona(){
  fetch('http://localhost:8888/api/info',
 {
  headers: {
    nombre: 'name_id',
    apellido: 'apellidos_id',
    email:'email_id',
    tel: 'phone_id',
    Accept: 'form/json'
  },
   method: "POST",
   mode: "cors",
   payload:raw
 })
  
  .then((res) => {
    if (res.ok) {
      return res.json();
    } else {
      throw new Error("Error petición");
    }
  })

  .then(r=> {
    persona =r;
  })
  
  .catch((error) => {
    console.log(error);
  });
};