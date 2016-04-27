/******************************************************************************
 *  Name:Michael Paquette
 *
 *  Operating system:Mac OSX
 *  Compiler:
 *  Text editor / IDE:TextWrangler and Eclipse
 *  Hours to complete assignment (optional):
 ******************************************************************************/



/******************************************************************************
 *  Explain briefly how you implemented the randomized queue and deque.
 *  Which data structure did you choose (array, linked list, etc.)
 *  and why?
 *****************************************************************************/
Used a Linked List for the Deque so it doesnt have to resize an array. Used an array in RandomizedQueue 
because arrays are better for shuffling. 

/******************************************************************************
 *  How much memory (in bytes) do your data types use to store N items
 *  in the worst case? Use the 64-bit memory cost model from Section
 *  1.4 of the textbook and use tilde notation to simplify your answer.
 *  Briefly justify your answers and show your work.
 *
 *  Do not include the memory for the items themselves (as this
 *  memory is allocated by the client and depends on the item type)
 *  or for any iterators, but do include the memory for the references
 *  to the items (in the underlying array or linked list).
 *****************************************************************************/

Randomized Queue:   ~  42N + 24  bytes

Deque:              ~  24N + 42  bytes




/******************************************************************************
 *  Known bugs / limitations.
 *****************************************************************************/




/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and exercises, but do
 *  include any help from people (including classmates and friends) and
 *  attribute them by name.
 *****************************************************************************/
Galbraith Wiliams and Angela Aley

/******************************************************************************
 *  Describe any serious problems you encountered.
 *****************************************************************************/

I got a few out of bounds errors. The main problem was specifying the end of file in eclipse. 
It is supposed to be Command + D but it wasnt working. So we ran it through a terminal window and it worked. 


/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback
 *  on how much you learned from doing the assignment, and whether
 *  you enjoyed doing it.
 *****************************************************************************/