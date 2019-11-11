package pl.dymek.tau.starscatalog.domain.models;

public interface Model {
    public int getId();
    public void setCreatedAt(Long time);
    public void setUpdatedAt(Long time);
    public void setReadedAt(Long time);
}
