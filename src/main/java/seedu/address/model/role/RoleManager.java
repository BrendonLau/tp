package seedu.address.model.role;

import java.util.ArrayList;

/**
 * Represents the list of all roles tagged to a Company found in the address book.
 */
public class RoleManager {
    private ArrayList<Role> roleList;

    public RoleManager() {
        this.roleList = new ArrayList<>();
    }

    public RoleManager(ArrayList<Role> roleList) {
        this.roleList = roleList;
    }

    /**
     * Obtains the list of roles tagged to a Company
     * @return <code>ArrayList</code> representing the list of roles
     */
    ArrayList<Role> getRoles() {
        return this.roleList;
    }

    /**
     * Obtains the number of roles
     * @return Integer representing the number of roles
     */
    int countRoles() {
        return this.roleList.size();
    }

    void addRole(Role role) {
        this.roleList.add(role);
    }

    void deleteRole(int index) {
        this.roleList.remove(index);
    }
}
