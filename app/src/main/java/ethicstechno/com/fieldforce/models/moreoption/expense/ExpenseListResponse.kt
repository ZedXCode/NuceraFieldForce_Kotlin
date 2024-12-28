package ethicstechno.com.fieldforce.models.moreoption.expense

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExpenseListResponse(
    @SerializedName("ExpenseId") val expenseId: Int,
    @SerializedName("UserId") val userId: Int,
    @SerializedName("AttendanceId") val attendanceId: Int,
    @SerializedName("UserName") val userName: String,
    @SerializedName("ExpenseDate") val expenseDate: String,
    @SerializedName("CityId") val cityId: Int,
    @SerializedName("CityCategoryId") val cityCategoryId: Int,
    @SerializedName("ExpenseTypeId") val expenseTypeId: Int,
    @SerializedName("ControlModeId") val controlModeId: Int,
    @SerializedName("VehicleTypeId") val vehicleTypeId: Int,
    @SerializedName("EligibleAmount") val eligibleAmount: Double,
    @SerializedName("ApprovedAmount") val approvedAmount: Double,
    @SerializedName("MapKm") val mapKm: Double,
    @SerializedName("ExpenseAmount") val expenseAmount: Double,
    @SerializedName("ActualKm") val actualKm: Double,
    @SerializedName("Remarks") val remarks: String,
    @SerializedName("DocumentPath") val documentPath: String,
    @SerializedName("StatusId") val statusId: Int,
    @SerializedName("IsExpenseApprovedFirst") val isExpenseApprovedFirst: Boolean,
    @SerializedName("ExpenseApprovedDateFirst") val expenseApprovedDateFirst: String,
    @SerializedName("ExpenseApprovedByFirst") val expenseApprovedByFirst: Int,
    @SerializedName("FinalAmount") val finalAmount: Double,
    @SerializedName("IsExpenseRejectedFirst") val isExpenseRejectedFirst: Boolean,
    @SerializedName("ExpenseRejectedDateFirst") val expenseRejectedDateFirst: String,
    @SerializedName("ExpenseRejectedByFirst") val expenseRejectedByFirst: Int,
    @SerializedName("ExpenseRejectionRemarksFirst") val expenseRejectionRemarksFirst: String?,
    @SerializedName("IsExpenseApprovedSecond") val isExpenseApprovedSecond: Boolean,
    @SerializedName("ExpenseApprovedDateSecond") val expenseApprovedDateSecond: String,
    @SerializedName("ExpenseApprovedBySecond") val expenseApprovedBySecond: Int,
    @SerializedName("IsExpenseRejectedSecond") val isExpenseRejectedSecond: Boolean,
    @SerializedName("ExpenseRejectedDateSecond") val expenseRejectedDateSecond: String,
    @SerializedName("ExpenseRejectedBySecond") val expenseRejectedBySecond: Int,
    @SerializedName("ExpenseRejectionRemarksSecond") val expenseRejectionRemarksSecond: String?,
    @SerializedName("ExpenseRejectRemarks") val expenseRejectRemarks: String?,
    @SerializedName("TripId") val tripId: Int,
    @SerializedName("CreateBy") val createBy: String?,
    @SerializedName("CreateDateTime") val createDateTime: String,
    @SerializedName("UpdateBy") val updateBy: String?,
    @SerializedName("UpdateDateTime") val updateDateTime: String,
    @SerializedName("DeleteBy") val deleteBy: Int,
    @SerializedName("DeleteDateTime") val deleteDateTime: String,
    @SerializedName("Success") val success: Boolean,
    @SerializedName("ReturnMessage") val returnMessage: String?,
    @SerializedName("ExpenseTypeName") val expenseTypeName: String,
    @SerializedName("ControlModeName") val controlModeName: String,
    @SerializedName("VehicleTypeName") val vehicleTypeName: String,
    @SerializedName("CityCategoryName") val cityCategoryName: String,
    @SerializedName("ExpenseFinalApprovedStatus") val expenseFinalApprovedStatus: String?,
    @SerializedName("ExpenseFinalRejectedStatus") val expenseFinalRejectedStatus: String?,
    @SerializedName("FromDate") val fromDate: String,
    @SerializedName("ToDate") val toDate: String,
    @SerializedName("ExpenseStatusName") val expenseStatusName: String,
    @SerializedName("CityName") val cityName: String,
    @SerializedName("DocumentNo") val doccumentNo: Int,
    var isChecked: Boolean = false
) : Parcelable {
    constructor() : this(
        0, 0, 0, "", "", 0, 0, 0, 0, 0,
        0.0, 0.0, 0.0, 0.0, 0.0, "",
        "", 0, false, "", 0,
        0.0, false, "", 0, "",
        false, "", 0, false, "", 0,
        "", "", 0, "", "", "", "", 0, "",
        false, "", "", "", "", "", "", "", "", "", "", "",0,false
    )
}
