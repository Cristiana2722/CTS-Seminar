package cts.costan.cristiana.g1103.factory_method;

public class StandUpComedyFactory implements ShowFactory {
    @Override
    public IShow createShow() {
        return new StandUpComedy();
    }
}
