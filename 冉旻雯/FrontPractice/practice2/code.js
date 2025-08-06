let text = document.getElementById("text-1");
//ボタン要素を取得
let btnEvent = document.getElementById("apple");
btnEvent.addEventListener("click", () => {
    text.innerHTML = "リンゴ";
});
