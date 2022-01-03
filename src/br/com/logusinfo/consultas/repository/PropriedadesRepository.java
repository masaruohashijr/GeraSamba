package br.com.logusinfo.consultas.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.logusinfo.consultas.ConnUtil;
import br.com.logusinfo.consultas.ConnectionException;
import br.com.logusinfo.consultas.model.Propriedade;

public class PropriedadesRepository {

	private Connection connection;

	private PreparedStatement pstmt;

	private StringBuilder sql;

	private String esquemaOrigem;

	public PropriedadesRepository(String esquemaOrigem) {
		this.esquemaOrigem = esquemaOrigem;
		// TODO Auto-generated constructor stub
	}

	public List<Propriedade> getPropriedades(String idConsulta) {
		List<Propriedade> propriedades = new ArrayList<Propriedade>();
		try {
			connection = ConnUtil.init();
			sql = new StringBuilder();
			sql.append("SELECT\r\n"
						+ "    b.id_propriedade,\r\n"
						+ "    b.id_nivel,\r\n"
						+ "    b.nom_coluna,\r\n"
						+ "    b.tit_propriedade,\r\n"
						+ "    b.chave,\r\n"
						+ "    b.desc_padrao,\r\n"
						+ "    b.tip_propriedade,\r\n"
						+ "    b.oculta,\r\n"
						+ "    b.georef,\r\n"
						+ "    a.id_consulta,\r\n"
						+ "    a.id_eixo,\r\n"
						+ "    a.id_estilo,\r\n"
						+ "    a.seq_no,\r\n"
						+ "    a.seq_propriedade_no\r\n"
						+ " FROM\r\n"
						+ "    "+esquemaOrigem+".fv_propriedade_no a \r\n"
						+ " LEFT JOIN flex_divida_pi.propriedade b ON a.id_propriedade = b.id_propriedade \r\n"
						+ " WHERE \r\n"
						+ "    a.id_consulta = ?");
			pstmt = connection.prepareStatement(sql.toString());
			pstmt.setString(1, idConsulta);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Propriedade propriedade = new Propriedade();
				propriedade.setId(rs.getString(1));
				propriedade.setIdNivel(rs.getString(2));
				propriedade.setNomeColuna(rs.getString(3));
				propriedade.setTitPropriedade(rs.getString(4));
				propriedade.setChave(rs.getString(5));
				propriedade.setDescricaoPadrao(rs.getString(6));
				propriedade.setTipoPropriedade(rs.getString(7));
				propriedade.setEhOculta(rs.getString(8));
				propriedade.setGeoRef(rs.getString(9));
				propriedade.setIdConsulta(rs.getString(10));
				propriedade.setIdEixo(rs.getString(11));
				propriedade.setIdEstilo(rs.getString(12));
				propriedade.setSeqNo(rs.getString(13));
				propriedade.setSeqPropriedadeNo(rs.getString(14));
				propriedades.add(propriedade);
			}
		} catch (ConnectionException | SQLException e) {
			e.printStackTrace();
		}
		return propriedades;
	}

}
