# Pseudo-Rock-Paper-Scissors-
### *Gorilla-Gun-Man*
## *Tools used*
- Language: Java
- Compiler: VSCode
- Version: 1.0

## *Pseudo Code*
1. Players choose rock, paper, or scissors
   1. Represent Choices with a `String`
      1. R - rock
      2. P - paper
      3. S - Scissors
   2. Store Choices
      1. Prompt `Scanner` obect `nextLine()`
      2. `String playerOneChoice`
      3. `String playerTwoChoice`
2. Count down and reveal choices on "shoot"
   1. `Thread.sleep()` to artificially wait
3. Compare choices of players 
   1. Rock beats scissors
   2. Scissors beats paper
   3. Paper beats rock
