//要素の取得
const valueDisplay = document.getElementById('value');
const reset = document.getElementById("reset");
const increment = document.getElementById("increment");
const decrement = document.getElementById('decrement');

//countの初期化
let count = 0;
//更新関数
function updateDisplay() {
    valueDisplay.textContent = count;
}
//リセット
reset.addEventListener('click', () => {
    count = 0;
    updateDisplay();
});

//加算
increment.addEventListener("click", () => {
    count++;
    updateDisplay();
});
//減算
decrement.addEventListener("click", () => {
    count--;
    updateDisplay();
});

