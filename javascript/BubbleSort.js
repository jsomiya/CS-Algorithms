function bubble_sort (input) {
  let len = input.length;
  let sorted = false;

  do {
    let swaps = 0;

    for (let i = 0; i < len - 1; i++){
      if (input[i] > input[i+1]) {
        let temp = input[i];
        input[i] = input[i+1];
        input[i+1] = temp;
        swaps++;
      }
    }

    swap == 0 ? sorted = true : null;

  } while (!sorted);

  return input;
}
