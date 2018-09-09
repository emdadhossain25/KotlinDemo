enum class Direction{
    NORTH, SOUTH, EAST, WEST;
}

fun main(args: Array<String>) {
    var usedDirection = Direction.SOUTH

    if(usedDirection == Direction.NORTH){
        println("he went to north")

    }else if (usedDirection == Direction.SOUTH){
        println("he went to south")
    }
        else if (usedDirection == Direction.EAST){
        println("he went to east")

    }
        else if (usedDirection == Direction.WEST){
        println("he went to west")
    }

}