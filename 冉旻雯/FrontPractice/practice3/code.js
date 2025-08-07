//要素の取得
let label = document.getElementById("label");
let button1 = document.getElementById("change-text1");
let button2 = document.getElementById("change-text2");
let button3 = document.getElementById("change-text3");

let count =0;
// リセットボタン ０に戻す
button1.addEventListener("click", () => {
    label.innerHTML = count;
});

// 1を加算ボタン 
button2.addEventListener("click",() =>{
    label.innerHTML = count =+1;
});

// 1を減算ボタン 
button3.addEventListener("click",() =>{
    label.innerHTML = count =-1;
});