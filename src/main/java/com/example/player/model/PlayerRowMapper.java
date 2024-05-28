package com.example.player.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.example.player.model.Player;

public class PlayerRowMapper implements RowMapper<Player> {

    @Override
    public Player mapRow(ResultSet rs, int num) throws SQLException {

        return new Player(
                rs.getInt("playerid"),
                rs.getString("playerName"),
                rs.getInt("jerseyNumber"),
                rs.getString("role"));
    }
}
