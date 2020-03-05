package chapter04.functionalInterface;
/**
 * @author AminSh
 */
//FunctionalInterface is an Interface with only one abstract method
//it allows java programmers to pars code as data
@FunctionalInterface
public interface GreetingMessage {

        public abstract void greet(String name);
    }
