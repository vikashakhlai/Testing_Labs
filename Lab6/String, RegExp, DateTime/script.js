let str = "ahb acb aeb aeeb adcb axeb";
console.log(str.match(/a[\S]b/g));

//2 part

let str2 = "2 + 3 223 2223 ";
console.log(str2.match(/2\s[+]\s3/g));

//3 part

let date = new Date();
console.log(date.getDay());
console.log(date.getMonth() + 1);
console.log(date.getFullYear());
