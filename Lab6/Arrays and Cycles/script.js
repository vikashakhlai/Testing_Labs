//1 part

let movies = ["mov1", "mov2", "mov3"];
movies.forEach(alert);

//2 part

let manufacturers = ["BMW", "Lada", "MAN"];
let manufacturersToString = manufacturers.join(" ");
let manufacturersToArray = manufacturersToString.split(" ");

//3 part

let friends = ["Maks", "Lera", "Julia"];
friends.map((el) => "hello" + el);

//4 part

let numbers = [1, 2, 3];
Boolean(numbers);

//5 part

let mas = [1, 6, 7, 8, 3, 4, 5, 6];
mas.sort((a, b) => b - a);

//6 part

mas.filter((item) => item > 3);

//7 part

function params(arr, index) {
  return arr.indexOf(index);
}

//8 part

let a = 13;
while (a >= 10) {
  alert(a--);
}

//9 part

function Prime(num) {
  Prime: for (let i = 2; i <= num; i++) {
    for (let j = 2; j < i; j++) {
      if (i % j == 0) continue Prime;
    }

    console.log(i);
  }
}

//10part

for (let num = 0; num < 10; num++) {
  if (num % 2 !== 0) {
    alert(num);
  }
}
