package dkim.antisocial.domain;

public final class Views {
    public interface Id {}

    public interface IdText extends Id {}

    public interface IdDate extends Id {}

    public interface FullMessage extends IdText, IdDate {}
}
