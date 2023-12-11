package pl.put.poznan.transformer.logic;

public interface IElement {
    void accept(IVisitor visitor);
}
