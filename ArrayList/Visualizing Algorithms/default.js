/*
This program allows you to experiment with visualizing different sorting
algorithms.

When you click run it will ask you to choose a sorting algorithm.

This program is written in Javascript instead of Java.
If you're interested in learning more about Javascript, check out
the CodeHS Introduction to Computer Science course!


Program created by Zach Keeshin, extended by Jeremy Keeshin.
*/

var MAX_VALUE = 25;

var MULTIPLIER = 25;

var LENGTH = 25;

var WIDTH;

var listOfPermutations = [];

var counter = 0;

var DELAY = 100;

//The following are the constants for the different algorithms
var SELECTION_SORT = 1;
var INSERTION_SORT = 2;


function start(){
    setSize(400, 300);
    LENGTH = readInt("How many items in the array?");
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
    var numSort = readLine("Which sorting algorithm would you like to use?\nEnter 1 for Selection sort\nEnter 2 for Insertion sort"
    );
    
    if(numSort == SELECTION_SORT){
        selectionSort(arr); 
    }else if(numSort == INSERTION_SORT){
        insertionSort(arr);
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