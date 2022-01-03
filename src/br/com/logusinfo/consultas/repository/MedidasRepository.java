package br.com.logusinfo.consultas.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.logusinfo.consultas.ConnUtil;
import br.com.logusinfo.consultas.ConnectionException;
import br.com.logusinfo.consultas.model.Filtro;
import br.com.logusinfo.consultas.model.Medida;
import br.com.logusinfo.consultas.model.Node;

public class MedidasRepository {

	private Connection connection;

	private PreparedStatement pstmt;

	private StringBuilder sql;

	private String esquemaOrigem;

	public MedidasRepository(String esquemaOrigem) {
		this.esquemaOrigem = esquemaOrigem;
	}

	public Medida getMedida(String idMedida) {
		Medida medida = new Medida();
		try {
			connection = ConnUtil.init();
			sql = new StringBuilder();
			sql.append(" SELECT \r\n"
					+ "    id_medida, \r\n"
					+ "    id_cubo, \r\n"
					+ "    col_medida, \r\n"
					+ "    tit_medida, \r\n"
					+ "    exp_filtro, \r\n"
					+ "    e_padrao, \r\n"
					+ "    des_medida \r\n"
					+ " FROM \r\n"
					+ "    "+esquemaOrigem+".medida \r\n"
					+ " WHERE id_medida = ? ");
			pstmt = connection.prepareStatement(sql.toString());
			pstmt.setString(1, idMedida);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				medida.setId(rs.getString(1));
				medida.setIdCubo(rs.getString(2));
				medida.setColMedida(rs.getString(3));
				medida.setTituloMedida(rs.getString(4));
				medida.setExpressaoFiltro(rs.getString(5));
				medida.setEhPadrao(rs.getString(6));
				medida.setDescricaoMedida(rs.getString(7));
			}
		} catch (ConnectionException | SQLException e) {
			e.printStackTrace();
		}
		return medida;
	}

}
