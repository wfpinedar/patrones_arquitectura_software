import java.util.Calendar;
import java.awt.*;
import javax.swing.*;

class EntrpSrchBuilder extends UIBuilder {
    JLabel lblEnterprise = new JLabel("Name :");

    private JTextField txtEnterprise = new JTextField(15);
    private JTextField txtNit = new JTextField(15);
    private JTextField txtCountry = new JTextField(10);
    private JTextField txtAddress = new JTextField(50);

    public void addUIControls() {
        searchUI = new JPanel();
        JLabel lblEnterprise = new JLabel("Name :");
        JLabel lblNit = new JLabel("Nit:");
        JLabel lblCountry = new JLabel("Country:");
        JLabel lblAddress = new JLabel("Address: ");

        GridBagLayout gridbag = new GridBagLayout();
        searchUI.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        searchUI.add(lblEnterprise);
        searchUI.add(txtEnterprise);
        searchUI.add(lblNit);
        searchUI.add(txtNit);
        searchUI.add(lblCountry);
        searchUI.add(txtCountry);
        searchUI.add(lblAddress);
        searchUI.add(txtAddress);

        gbc.anchor = GridBagConstraints.WEST;

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblEnterprise, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblNit, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblCountry, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(txtEnterprise, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(txtNit, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(txtCountry, gbc);
    }

    public void initialize() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new java.util.Date());

        txtEnterprise.setText("Enter Enterprise Name Here");
        txtNit.setText("Enter Nit Here");
        txtCountry.setText("Enter Country Here");
        txtAddress.setText("Enter Address Here");
    }

    public String getSQL() {
        return ("Select * from Enterprise where EnterpriseName='" +
                txtEnterprise.getText() + "'" + " and Nit='" +
                txtNit.getText() + "' and Address='" +
                txtAddress.getText() + "' and Country='" +
                txtCountry.getText() + "'");

    }

}
