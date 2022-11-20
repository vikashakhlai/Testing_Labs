const Calculator = require("../../app/Calculator");
const { expect } = require("chai");

describe("Method add and multiply in calculator", function () {
  let calc;
  beforeEach(() => {
    calc = new Calculator();
  });

  afterEach(() => {
    calc = null;
  });

  it("should return 10 when called with numbers 4 and 6", function () {
    expect(calc.methodAdd(5, 6)).to.be.equal(10);
  });

  it("should return 20 when called with numbers 26 and 20", function () {
    expect(calc.methodMultiply(26, 20)).to.be.equal(520);
  });
});
