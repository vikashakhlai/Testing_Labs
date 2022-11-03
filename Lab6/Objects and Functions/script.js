let car = {
  color: "black",
};

//second part
car.color = "green";

//third part

car.power = function (p) {
  console.log("Car power is:", p);
};

car.power(100);
//part

let sum = (apple, pear) => {
  return apple + pear;
};

//part

function name(inputName) {
  if (inputName.trim() === saveName) {
    alert("Hello " + inputName.trim());
  } else {
    alert("No such name.");
  }
}

// let saveName = "TestName";
// let inputName = prompt("What is your name?");
// name(inputName);

//part

function type(param) {
  let type = typeof param;
  console.log(type);
}

//part

function Prime(num) {
  let flag = false;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      alert("number is not prime");
      flag = true;
      break;
    }
  }
  if (num > 1 && !flag) {
    alert("number is prime");
  }
}
