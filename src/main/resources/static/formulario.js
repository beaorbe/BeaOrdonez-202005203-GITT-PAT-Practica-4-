
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



  const addItemToList = (item) => {
    const newItem = `<button id="${item.key}" class="list-group-item list-group-item-action">
      ${item.title}
    </button>`;
    $("#list-entries-blog").append(newItem);
  
    $("#" + item.key).on("click", () => {
      showBlogPost(item.key);
    });
  };


  const showBlogPost = (key) => {
    hideWindowContent();
  
    const entry = entries[key];
  
    $("#blog-entry-title").html(entry.title);
    $("#blog-entry-author").html(entry.author);
    $("#blog-entry-comment").html(entry.comments);
  
    showWindowContent("blog-entry");
  };

  