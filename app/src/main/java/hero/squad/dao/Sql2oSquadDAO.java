package hero.squad.dao;

import hero.squad.models.Squad;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oSquadDAO implements SquadDAO{
    private final Sql2o sql2o;

    public Sql2oSquadDAO(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<Squad> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM squads")
                    .executeAndFetch(Squad.class);
        }
    }

    @Override
    public void add(Squad squad) {
        String sql = "INSERT INTO squads (name, role) VALUES (:name, :role)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql, false)
                    .bind(squad)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void update(Squad hero) {

    }

    @Override
    public Squad findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllSquads() {

    }
}
