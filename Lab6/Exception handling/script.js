try {
  console.log(a);
  let a = 3;
} catch (err) {
  console.error("'let must be declared'");
}

try {
  let del = 1 / 0;
  if (del == Infinity || del == -Infinity) {
    throw new ReferenceError("cannot be divided by zero");
  }
} catch (err) {
  console.error(err);
}
