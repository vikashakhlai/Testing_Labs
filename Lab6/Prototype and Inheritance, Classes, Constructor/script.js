class Animal {
  constructor(nickname) {
    this.nickname = nickname;
    this.move = true;
  }
}

class Cat extends Animal {
  constructor(nickname, move) {
    super(nickname, move);
  }
}
