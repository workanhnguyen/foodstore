/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nva.services;

import com.nva.pojo.NhanVien;
import com.nva.commonuse.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NhanVienServices {
    public List<NhanVien> getDanhSachNhanVienn() {
        List<NhanVien> danhSachNhanVien = new ArrayList<>();
        try (Connection conn = JdbcUtils.getConnection()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM nhanvien");

            while (rs.next()) {
                NhanVien nhanVien = new NhanVien(rs.getString("Id"), rs.getFloat("HeSoLuong"),
                        rs.getInt("LuongCoBan"), rs.getDate("NgayVaoLam"));
                danhSachNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
        }
        return danhSachNhanVien;
    }
}
