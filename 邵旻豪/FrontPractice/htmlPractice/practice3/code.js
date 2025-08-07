let num=0
let btnEvent1 = document.getElementById("button-1");
let btnEvent2 = document.getElementById("button-2");
let btnEvent3 = document.getElementById("button-3");
const text="値:"
let number=document.getElementById("number");

btnEvent1.addEventListener("click",()=>{
    num=0
    number.innerHTML=text+num;
});

btnEvent2.addEventListener("click",()=>{
    number.innerHTML=text+(num++);
});

btnEvent3.addEventListener("click",()=>{
    number.innerHTML=text+(num--);
});
