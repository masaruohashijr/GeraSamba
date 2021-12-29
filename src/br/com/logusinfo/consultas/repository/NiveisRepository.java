package br.com.logusinfo.consultas.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.logusinfo.consultas.ConnUtil;
import br.com.logusinfo.consultas.model.Nivel;

public class NiveisRepository {

	private Connection connection;

	private PreparedStatement pstmt;

	private StringBuilder sql;

	public List<Nivel> getNiveisCubo(String idCubo) {
		List<Nivel> niveis = new ArrayList<Nivel>();
		try {
			connection = ConnUtil.init();
			sql = new StringBuilder();
			sql.append(" SELECT\r\n" 
					+ "    a.id_cubo,\r\n" 
					+ "    a.id_nivel,\r\n" 
					+ "    a.col_fato,\r\n"
					+ "    b.id_dimensao,\r\n" 
					+ "    b.tit_nivel,\r\n" 
					+ "    b.tit_abreviado,\r\n"
					+ "    b.tab_nivel,\r\n" 
					+ "    b.col_nivel,\r\n" 
					+ "    b.col_titulo,\r\n"
					+ "    b.des_mascara,\r\n" 
					+ "    b.esquema\r\n" 
					+ " FROM\r\n"
					+ "         flex_divida_pi.nivel_cubo a\r\n"
					+ "    INNER JOIN flex_divida_pi.nivel b ON a.id_nivel = b.id_nivel\r\n" + "WHERE\r\n"
					+ "    a.id_cubo = ?");
			pstmt = connection.prepareStatement(sql.toString());
			pstmt.setString(1, idCubo);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Nivel nivel = new Nivel();
				nivel.setIdCubo(rs.getString(1));
				nivel.setIdNivel(rs.getString(2));
				nivel.setColunasFato(rs.getString(3));
				nivel.setIdDimensao(rs.getString(4));
				nivel.setTitulo(rs.getString(5));
				nivel.setAbreviacao(rs.getString(6));
				nivel.setTabelaNivel(rs.getString(7));
				nivel.setColunaNivel(rs.getString(8));
				nivel.setColunaTitulo(rs.getString(9));
				nivel.setMascara(rs.getString(10));
				nivel.setEsquema(rs.getString(11));
				niveis.add(nivel);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return niveis;
	}

	public Nivel getNivel(String idNivel) {
		Nivel nivel = new Nivel();
		try {
			connection = ConnUtil.init();
			sql = new StringBuilder();
			sql.append(" SELECT\r\n"
					+ "    id_nivel,\r\n"
					+ "    id_dimensao,\r\n"
					+ "    tit_nivel,\r\n"
					+ "    tit_abreviado,\r\n"
					+ "    tab_nivel,\r\n"
					+ "    col_nivel,\r\n"
					+ "    col_titulo,\r\n"
					+ "    des_mascara,\r\n"
					+ "    esquema\r\n"
					+ " FROM\r\n"
					+ "    flex_divida_pi.nivel"
					+ " WHERE id_nivel = ?");
			pstmt = connection.prepareStatement(sql.toString());
			pstmt.setString(1, idNivel);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {				
				nivel.setIdNivel(rs.getString(1));
				nivel.setIdDimensao(rs.getString(2));
				nivel.setTitulo(rs.getString(3));
				nivel.setAbreviacao(rs.getString(4));
				nivel.setTabelaNivel(rs.getString(5));
				nivel.setColunaNivel(rs.getString(6));
				nivel.setColunaTitulo(rs.getString(7));
				nivel.setMascara(rs.getString(8));
				nivel.setEsquema(rs.getString(9));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return nivel;
	}

}
