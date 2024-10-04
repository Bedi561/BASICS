// Find the smallest element in an array
Arrays.sort(arr);
return arr[0];

// Find the largest number in an array
Arrays.sort(arr);
return arr[arr.length-1];

// Find Second Smallest and Second Largest Element in an array
Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Step 2: Convert the HashSet to an array and sort it
        Integer[] sortedArray = uniqueElements.toArray(new Integer[0]);
        Arrays.sort(sortedArray);

        int secondSmallest = sortedArray[1];
        int secondLargest = sortedArray[sortedArray.length - 2];


// reverse a array - 2pointer
while (p1 < p2) {
    int tmp = arr[p1];
    arr[p1] = arr[p2];
    arr[p2] = tmp;
    p1++;
    p2--;
}


// Count the frequency of each element using
Map<Integer, Integer> frequency = new Hashmap<>();
for (int num : arr) {
    frequency.put(num, frequency.getOrDefault(num, 0) + 1);
    frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
}

// or

int[] count = new int[max + 1];
for (int num : arr) {
    count[num]++;
}

System.out.println("Frequency of each element:");
for (int i = 0; i < count.length; i++) {
    if (count[i] > 0) { // Only print elements that appear at least once
        System.out.println(i + " -> " + count[i]);
    }
}



// Rearrange array in increasing-decreasing order
Arrays.sort(arr);
        
// Step 2: Determine the midpoint
int mid = arr.length / 2;

// Step 3: Reverse the second half of the array
for (int i = mid, j = arr.length - 1; i < j; i++, j--) {
    // Swap elements to reverse the second half
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


// sum
for (int i = 0; i < n; i++) {
    sum += arr[i];
}


// right rotate mei 0->k-1 and k->n-1
// left rotate mei 0->k and k+1->n-1


// avg
double sum = 0;
for (int i = 0; i < n; i++) {
  sum += (double) arr[i];
}
double average = sum / n;


// median of array
Arrays.sort(arr);
	
	if (n % 2 == 0)
	{
		int ind1 = (n / 2) - 1;
		int ind2 = (n / 2);
		System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
	}
	else
	{
		System.out.print(arr[(n / 2)]);
	}


// Remove Duplicates in-place from Sorted Array
// 2pointers
int i = 0;
for (int j = 1; j < arr.length; j++) {
    if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
    }
}
return i + 1;

//hashset
HashSet<Integer> uniqueElements = new HashSet<>();
        
        // Step 2: Iterate through the array and add elements to the HashSet
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Step 3: Write the unique elements back to the original array
        int index = 0;
        for (int num : uniqueElements) {
            arr[index++] = num;
        }



//Remove Duplicates From an Unsorted Array
HashMap<Integer, Integer> mp = new HashMap<>();

for (int i = 0; i < n; i++) {
       if (!mp.containsKey(arr[i])) {
              System.out.print(arr[i] + " ");
              mp.put(arr[i], 1);
       }
}


// Adding Element in an Array
// 1. insertbeginning(6)
if (size < arr.length) {
    addAtStart(arr, size, startElement);
    size++; // Increase the logical size
} else {
    System.out.println("Array is full, cannot add at the start.");
}


public static void addAtStart(int[] arr, int size, int newElement) {
    for (int i = size; i > 0; i--) {
        arr[i] = arr[i - 1]; // Shift elements to the right
    }
    arr[0] = newElement; // Place new element at the start
}


// 2. insertending(7)
if (size < arr.length) {
    addAtEnd(arr, size, endElement);
    size++; // Increase the logical size
} else {
    System.out.println("Array is full, cannot add at the end.");
}

public static void addAtEnd(int[] arr, int size, int newElement) {
    arr[size] = newElement; // Place new element at the end
}


// 3. insertatpos(8,4)
if (position < 0 || position > size || size >= arr.length) {
    System.out.println("Invalid position or array is full.");
} else {
    addAtPosition(arr, size, specificElement, position);
    size++; // Increase the logical size
    System.out.println("After adding at position " + position + ": " + Arrays.toString(arr));
}

public static void addAtPosition(int[] arr, int size, int newElement, int position) {
    for (int i = size; i > position; i--) {
        arr[i] = arr[i - 1]; // Shift elements to the right from the position
    }
    arr[position] = newElement; // Place new element at the specified position
}



// Find all repeating elements in an array
int[] count = new int[max + 1];

        // Step 3: Count frequencies of each element
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Collect elements that repeat (frequency > 1)
        List<Integer> repeatingElements = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                repeatingElements.add(i);
            }
        }

        return repeatingElements; 

// if (count[i] == 1)


// Find all Symmetric Pairs in the array of pairs
HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    System.out.println("The Symmetric Pairs are: ");
    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];
      if (mp.get(second) != null && mp.get(second) == first) {
        System.out.print("("+first + " " + second+") ");
      } else {
        mp.put(first, second);
      }
}


// Maximum Product Subarray in an Array



// Replace elements by its rank in the array
 // Step 1: Clone the original array
 int[] sortedArr = arr.clone();
        
 // Step 2: Sort the cloned array
 Arrays.sort(sortedArr);
 
 // Step 3: Create a HashMap to store the rank of each element
 HashMap<Integer, Integer> rankMap = new HashMap<>();
 
 // Step 4: Assign ranks to the elements
 int rank = 1;
 for (int num : sortedArr) {
     // If the element doesn't already have a rank, assign the current rank
     if (!rankMap.containsKey(num)) {
         rankMap.put(num, rank);
         rank++;
     }
 }

 
 // Step 5: Create the result array by replacing each element with its rank
int[] result = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
result[i] = rankMap.get(arr[i]);
}





// Relative Sort Array
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Count the frequency of elements in arr1
        int[] count = new int[1001]; 
        for (int num : arr1) {
            count[num]++;
        }

        // Step 2: Place elements from arr2 into the result array according to their frequency in arr1
        int[] result = new int[arr1.length];
        int index = 0;
        
        // For each element in arr2, place them in result based on the frequency
        for (int num : arr2) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--; // Decrease the frequency
            }
        }

        // Step 3: Add remaining elements (those not in arr2) in sorted order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }
        
        return result;
    }
}





// PROBLEMS ON NUMBERS
// just read em from tuf


// strings

// Check if the given String is Palindrome or not
int left = 0, right = s.length()-1;
while(left<right)
{
    char l = s.charAt(left), r = s.charAt(right);
    if(!Character.isLetterOrDigit(l)) 
        left++;
    else if(!Character.isLetterOrDigit(r)) 
        right--;
    else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
        return false;
    else {
        left++; 
        right--;
    }
}
return true;



// or



String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);


// Count number of vowels, consonants, spaces in String
int vowels = 0, consonants = 0, whitespaces = 0;
str = str.toLowerCase(); // converting given string to lowercase
for (int i = 0; i < length; i++) {
  char ch = str.charAt(i);
  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    vowels++;
  else if (ch >= 'a' && ch <= 'z')
    consonants++;
  else if (ch == ' ')
    whitespaces++;
}





// 3. Find the ASCII value of a character
int asciiValue = (int) character;



// Remove all vowels from the string
return str.replaceAll("[aeiouAEIOU]", "");



// 5. Remove spaces from a string
return str.replaceAll("\\s+", "");


// Remove characters from a string except alphabets
return str.replaceAll("[^a-zA-Z]", "");


// reverse a string
return new StringBuilder(str).reverse().toString();


// Remove brackets from an algebraic expression
return str.replaceAll("[(){}\\[\\]]", "");


// Sum of the numbers in a String
int sum = 0;          // This will store the final sum of all numbers
int tempNumber = 0;    // This will store the current number while iterating the string

// Loop through each character in the string
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    
    // If the character is a digit, build the current number
    if (Character.isDigit(ch)) {
        tempNumber = tempNumber * 10 + (ch - '0');  // Convert char to int and add to tempNumber
    } 
    // If it's not a digit, add the current number to the sum and reset tempNumber
    else {
        sum += tempNumber;  // Add the current number to the sum
        tempNumber = 0;     // Reset the current number
    }


// Capitalize first and last character of each word
String[] words = str.split(" ");
StringBuilder result = new StringBuilder();

for (String word : words) {
    if (word.length() > 0) {
        char first = Character.toUpperCase(word.charAt(0));
        char last = Character.toUpperCase(word.charAt(word.length() - 1));
        String middle = word.substring(1, word.length() - 1);
        result.append(first).append(middle).append(last).append(" ");
    }
}


// or


if (i == 0 || i == (size - 1)) // Converting first and last index character to
{
  sb.setCharAt(i, Character.toUpperCase((char)(int) str.charAt(i)));
} else if (str.charAt(i) == ' ') // Converting characters present before and

{
  sb.setCharAt(i - 1, Character.toUpperCase((char)(int) str.charAt(i - 1)));
  sb.setCharAt(i + 1, Character.toUpperCase((char)(int) str.charAt(i + 1)));
}



// Calculate Frequency of characters in a String
int[] frequency = new int[256];

        // Iterate through the string and count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at the current index
            frequency[ch]++; // Increment the frequency count for this character
        }

        // Print the frequency of each character
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Check if the character occurred
                System.out.println((char)i + ": " + frequency[i]); // Print character and its frequency
            }
        }


// anagrams 
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();

// If lengths are not the same, they cannot be anagrams
if (str1.length() != str2.length()) {
    return false;
}

// Convert strings to character arrays
char[] charArray1 = str1.toCharArray();
char[] charArray2 = str2.toCharArray();

// Sort both character arrays
Arrays.sort(charArray1);
Arrays.sort(charArray2);

// Compare sorted character arrays
return Arrays.equals(charArray1, charArray2);



// Maximum occurring character in a string
int maxfreq = 0, n = str.length();
      int count[] = new int[256];
      for (int i = 0; i < n; i++) {
         count[str.charAt(i)]++;
         if (count[str.charAt(i)] > maxfreq) {
            maxfreq = count[str.charAt(i)];
            ans = str.charAt(i);
         }
      }

// or

Map<Character, Integer> frequencyMap = new HashMap<>();
for (char ch : str.toCharArray()) {
    frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
}

// Step 2: Find the character with the maximum frequency
char maxChar = str.charAt(0);
int maxCount = 1;
for (Character ch : frequencyMap.keySet()) {
    if (frequencyMap.get(ch) > maxCount) {
        maxCount = frequencyMap.get(ch);
        maxChar = ch;
    }
}





// 2. Remove all duplicates from the input string
StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        // Step 1: Traverse through the string and add unique characters to the result
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();



// Print all the duplicates in the input string
        Map<Character, Integer> frequencyMap = new HashMap<>();
        Set<Character> duplicates = new HashSet<>();

        // Step 1: Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : frequencyMap.keySet()) {
            if (frequencyMap.get(ch) > 1) {
                duplicates.add(ch);
            }
        }
        

 // 4. Remove characters from the first string that are present in the second string
        Set<Character> charsToRemove = new HashSet<>();
        
        // Step 1: Add all characters from the second string to a set
        for (char ch : str2.toCharArray()) {
            charsToRemove.add(ch);
        }

        StringBuilder result = new StringBuilder();
        
        // Step 2: Traverse through the first string and remove matching characters
        for (char ch : str1.toCharArray()) {
            if (!charsToRemove.contains(ch)) {
                result.append(ch);
            }
        }
return result.toString();



// Find the largest word in a String
String[] words = str.split(" ");  // Split the string by spaces
String largestWord = "";

for (String word : words) {
    if (word.length() > largestWord.length()) {
        largestWord = word;
    }
}


// Write a program to sort characters in a string
char[] charArray = str.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Convert the sorted character array back into a string
        return new String(charArray);



// find numner of words
int n = str.length();
    int spaces = 0;

    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == ' ')
        spaces = spaces + 1;
    }

    System.out.print("Number of words are ");
    System.out.print(spaces + 1);



// concatenate
String str1 = "Hello";
String str2 = "World";

str1 = str1+ str2;


// reverse words in string
StringBuilder result = new StringBuilder();
        
// Step 1: Reverse the order of words
for (int i = words.length - 1; i >= 0; i--) {
    result.append(words[i]).append(" ");
}


// find in string
return str.indexOf(subStr);