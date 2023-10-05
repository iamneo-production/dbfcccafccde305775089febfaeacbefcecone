public class MedicineController {
    private Map<Integer,Medicine>medicineMap=new HashMap<>();
    public boolean addMedicine(Medicine medicine){
        if(medicineMap.containsKey(medicine.getMedicineId())){
            return false;
        }
        medicineMap.put(medicine.getMedicineId(),medicine);
        return true;
    }
    public Medicine updateMedicine(int medicineId,Medicine updatedMedicine){
        if (medicineMap.containsKey(medicineId)) {
            Medicine medicine=medicineMp.get(medicineId);
            medicine.setMedicineName(updatedMedicine.getMedicineName());
            medicine.setPrice(updatedMedicine.getPrice());
            medicine.setQuantity(updatedMedicine.getQuantity());
            medicine.setDescription(updatedMedicine.getDescription());
            return medicine;
        }
        return null;
    }
}
