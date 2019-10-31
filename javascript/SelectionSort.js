function selection_sort(input) {
  let minIndex;
  let temp;
  let len = input.length;

  for (let i = 0; i < len; i++) {
    minIndex = i;
    for (let j = i + 1; j < len; j++) {
      if (input[j] < input[minIndex]) {
        minIndex = j;
      }
    }
    temp = input[i];
    input[i] = input[minIndex];
    input[minIndex] = temp;
  }

  return input;
}
