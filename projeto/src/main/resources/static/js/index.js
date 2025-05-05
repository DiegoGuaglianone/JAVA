function eventos(){
    document.querySelector("#btn1").addEventListener("click",ola);
}

function ola(){
    alert("Olá, mundo!")
}

window.onload = eventos;