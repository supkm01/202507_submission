let text=document.getElementById("text");
let btnEvent1 = document.getElementById("button-1");
let btnEvent2 = document.getElementById("button-2");
let btnEvent3 = document.getElementById("button-3");
btnEvent1.addEventListener("click",()=>{
    text.innerHTML="りんご";
});


btnEvent2.addEventListener("click",()=>{
    text.innerHTML="バナナ";
});

btnEvent3.addEventListener("click",()=>{
    text.innerHTML="みかん";
});

