# Java Practice1〜3 総合レビュー

作成された3つのJavaプログラムに対する総合的な評価と解説を記載します。

---

## ✅ Practice1.java の評価【変数と条件分岐の練習】

### 🔍 内容の確認

| 項目 | 評価内容 |
|------|----------|
| `isHungry`の定義 | `int isHungry = 1;` → ✅OK |
| `food`の定義 | `String food = "ハンバーグ";` → ✅OK |
| 「こんにちは」の出力 | `System.out.println("こんにちは");` → ✅OK |
| 条件分岐の処理 | ✅空腹と満腹の判断を正しく分岐できている |
| 最後の挨拶 | ✅「ごちそうさまでした」も表示されている |

### 💬 コメント
- 教科書通りで非常に丁寧なコード。日本語出力も明確でOKです。
- **改善点なし。完璧な実装です！**

---

## ✅ Practice2.java の評価【メソッド定義と戻り値の練習】

### 🔍 内容の確認

| 項目 | 評価内容 |
|------|----------|
| 三角形の面積メソッド | `calcTriangleArea(double base, double height)` → ✅OK |
| 円の面積メソッド | `calcCircleArea(double radius)` → ✅OK |
| 戻り値の型 | `double`型で正確 → ✅OK |
| メソッドの呼び出し | `System.out.println()`で正しく出力 → ✅OK |
| 実行結果 | `25.0` および `78.5` → ✅OK |

### 💬 コメント
- 戻り値の型や数値計算も正しく、文法的にも正確。
- **改善点なし。教科書の模範解答レベルです。**

---

## ❌ Practice3.java の評価【最大値を求める練習】

### 🔍 現在のコードの問題点

```java
public static int findMax(int[] arr) {
    int maxnum = 0, num;
    for (int i = 0; i < arr.length; i++) {
        num = arr[i];
        while (maxnum < num) {
            maxnum = num;
        }
    }
    return maxnum;
}
```

- `while`文を使う必要がない（`if`文で十分）
- すでに最大値に達していたら無限ループの恐れあり
- `maxnum`の初期値を`0`にしているため、配列がすべて負の値の場合に誤動作

---

### ✅ 修正後の正しいコード

```java
public static int findMax(int[] arr) {
    int maxnum = arr[0]; // 最初の要素を仮の最大値とする
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > maxnum) {
            maxnum = arr[i];
        }
    }
    return maxnum;
}
```

### ✅ 実行結果（期待通り）

```
Maximum value in the array: 9
```

---

## 🎯 総合評価まとめ

| プログラム名 | 評価 | コメント |
|--------------|------|----------|
| Practice1.java | ⭐️⭐️⭐️⭐️⭐️ | 変数・条件分岐の使い方が完璧です。 |
| Practice2.java | ⭐️⭐️⭐️⭐️⭐️ | メソッド定義と戻り値が非常に適切。 |
| Practice3.java | ⭐️⭐️☆☆☆ | `while`の使い方に誤りあり。`if`への修正が必要です。 |

---

## 💡 アドバイス

- `while` と `if` の違いを明確に理解しましょう。
- 「最大値」以外にも「最小値」「合計」「平均」など、配列処理の練習もオススメです！

---
