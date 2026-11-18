package com.example.attempt_1

data class ShoppingListItem(val id: Int, val name: String, val isDone: Boolean = false) {
    // Have no idea if this was supposed to be a regular class or a data class, the data class needed an
    // argument which i just gave now.

    // I am thinking we will create our own list item, so maybe we need to use this to therefore create
    // a dataclass - I just had the idea to use this as a template of sorts that we can reuse - this is the idea
    //below

    //this makes sense to me, we are passing in the argument which will be the users input into this name variable.
}
