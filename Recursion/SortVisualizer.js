/*
This program allows you to experiment with visualizing different sorting
algorithms.

When you click run it will ask you to choose a sorting algorithm.


Program created by Zach Keeshin, extended by Jeremy Keeshin.

Please note: This program is written in JavaScript, not Java.
*/

var MAX_VALUE = 25;

var MULTIPLIER = 25;

var LENGTH = 25;

var WIDTH;

var listOfPermutations = [];

var counter = 0;

var DELAY = 100;

//The following are the constants for the different algorithms
var BUBBLE_SORT = 0;
var SELECTION_SORT = 1;
var INSERTION_SORT = 2;
var MERGE_SORT = 3;
var QUICKSORT = 4;

function start(){
    setSize(400, 300);
    LENGTH = readInt("How many items in the array (< 80)?");
    if (LENGTH > 80) {
        LENGTH = 80;
    }
    WIDTH = getWidth() / LENGTH;
    var myArray = fillArray(LENGTH);
    println(myArray);
    drawArray(myArray);
    println(myArray.length);
    addToList(myArray);

    askWhichAlgorithm(myArray);

    setTimer(drawAll, DELAY);
}

/*
This method will ask the user which algorithm they
would like to use using the JavaScript dialog boxes
on Chrome
*/
function askWhichAlgorithm(arr){
    var numSort = readLine("Which sorting algorithm would you like to use? "
    + "\nEnter 0 for Bubble sort"
    + "\nEnter 1 for Selection sort"
    + "\nEnter 2 for Insertion sort"
    + "\nEnter 3 for Merge sort"
    + "\nEnter 4 for Quicksort");
    
    if(numSort == BUBBLE_SORT){
        bubbleSort(arr);
    }else if(numSort == SELECTION_SORT){
        selectionSort(arr); 
    }else if(numSort == INSERTION_SORT){
        insertionSort(arr); 
    }else if(numSort == MERGE_SORT){
        mergeSort(arr, 0, arr.length); 
    }else if(numSort == QUICKSORT){
        quickSort(arr, 0, arr.length); 
    }else{
        println("Not a valid input :(");
    }
}

/*
This method creates and adds a deep copy of the
given array to the list of arrays.
*/
function addToList(arr){
    var copy = arr.slice(0);
    listOfPermutations.push(copy);
}

/*
This method draws every permutation of the array
on its way to being sorted. This is what will be
called on the timer in start().
*/
function drawAll(){
    if(counter >= listOfPermutations.length){
        return;
    }
    removeAll();
    drawArray(listOfPermutations[counter]);
    counter++;
}

/*
This draws a single array using a for loop and the gradient
formula adapted from the Water Color Grid exercise.
*/
function drawArray(arr){
    for(var i = 0; i < arr.length; i++){
        var rect = new Rectangle(WIDTH, arr[i] / MAX_VALUE * getHeight());
        rect.setPosition(i * WIDTH, getHeight()- rect.getHeight());
        var color = Color.createFromRGBL(64, 91, 122, 1 - arr[i]/MAX_VALUE);
        rect.setColor(color);
        add(rect);
    }
}
/*
This populates and returns an array of randomized ints
between 1 and MAX_VALUE of with "length" elements.
*/
function fillArray(length){
    var arr = [];
    for(var i = 0; i < length; i++){
        arr.push(Randomizer.nextInt(1, MAX_VALUE));
    }
    return arr;
}

/*
This method swaps the elements at the given
indices and is used as a utility for quickSort
and mergeSort.
*/
function swapQS(arr, i, j){
    if(arr[i] == arr[j]){
        return;
    }
    
    var t = arr[i];
	arr[i] = arr[j];
	arr[j] = t;
	addToList(arr);
}

function quickSort(arr, start, end) {
	var i, mid;

	if (end - start < 2) {
		return;
	}

	mid = end;
	for (i = start + 1; i < mid; ) {
		if (compare(arr, i, start) > 0) {
			swapQS(arr, i, --mid);
		} else {
			i++;
		}
	}
    swapQS(arr, start, mid - 1);

	quickSort(arr, start, mid - 1);
	quickSort(arr, mid, end);
}

function vswap(arr, a, b) {
	var t = arr[a];
	arr[a] = arr[b];
	arr[b] = t;
	addToList(arr);
}

function shift(arr, a, b) {
	for (; b > a; b--)
		vswap(arr, b - 1, b);
	// use this one for a faster merge
	//addToList(arr);
}

function compare(arr, i, j) {
	return arr[i] - arr[j];
}

function merge(arr, i, j, end) {
	for (; i < end; i++) {
		if (compare(arr, i, j) > 0 && j < end)
			shift(arr, i, j++);
	}
}

function mergeSort(arr, start, end) {
	var mid = Math.floor((start + end) / 2);

	if (end - start < 2)
		return;

	mergeSort(arr, start, mid);
	mergeSort(arr, mid, end);

	merge(arr, start, mid, end);
}

function insertionSort(items) {
    var len     = items.length,     // number of items in the array
        value,                      // the value currently being compared
        i,                          // index into unsorted section
        j;                          // index into sorted section
    
    for (i=0; i < len; i++) {
    
        // store the current value because it may shift later
        value = items[i];
        
        /*
         * Whenever the value in the sorted section is greater than the value
         * in the unsorted section, shift all items in the sorted section over
         * by one. This creates space in which to insert the value.
         */
        for (j=i-1; j > -1 && items[j] > value; j--) {
            items[j+1] = items[j];
        }

        items[j+1] = value;
    
        addToList(items);
    }
}

function swap(items, firstIndex, secondIndex){
    var temp = items[firstIndex];
    items[firstIndex] = items[secondIndex];
    items[secondIndex] = temp;
}

function selectionSort(items){
    var len = items.length,
        min;

    for (var i=0; i < len; i++){

        //set minimum to this position
        min = i;

        //check the rest of the array to see if anything is smaller
        for (var j=i+1; j < len; j++){
            if (items[j] < items[min]){
                min = j;
            }
        }

        //if the minimum isn't in the position, swap it
        if (i != min){
            swap(items, i, min);
        }
        addToList(items);
    }
}

function bubbleSort(values) {
  var length = values.length - 1;
  do {
    var swapped = false;
    for(var i = 0; i < length; ++i) {
      if (values[i] > values[i+1]) {
        swap(values, i, i+1)
        swapped = true;
        addToList(values);
      }
    }
  }
  while(swapped == true)
}
