# Deploying a Virtual Network (VNet) in Azure

This guide provides step-by-step instructions to deploy a Virtual Network (VNet) in Azure using the Azure Portal and Azure CLI.

## Prerequisites
- An active Azure subscription.
- Azure CLI installed on your local machine.

## Steps to Deploy a VNet

### Using Azure Portal
1. Log in to the [Azure Portal](https://portal.azure.com).
2. Navigate to **Virtual Networks** and click **+ Create**.
3. Fill in the required details:
   - **Subscription**: Select your subscription.
   - **Resource Group**: Create a new resource group or select an existing one.
   - **Name**: Provide a name for your VNet.
   - **Region**: Choose the region where you want to deploy the VNet.
4. Configure the **IP Addresses**:
   - Add an address space (e.g., `10.0.0.0/16`).
   - Add subnets (e.g., `10.0.1.0/24`).
5. Review and create the VNet.

### Using Azure CLI
1. Log in to Azure:
   ```bash
   az login
   ```
2. Create a resource group:
   ```bash
   az group create --name MyResourceGroup --location eastus
   ```
3. Create a VNet:
   ```bash
   az network vnet create \
     --name MyVNet \
     --resource-group MyResourceGroup \
     --address-prefix 10.0.0.0/16 \
     --subnet-name MySubnet \
     --subnet-prefix 10.0.1.0/24
   ```

## Verification
- Verify the VNet in the Azure Portal under **Virtual Networks**.
- Use the Azure CLI to list VNets:
  ```bash
  az network vnet list --output table
  ```

## Additional Resources
- [Azure Virtual Network Documentation](https://learn.microsoft.com/en-us/azure/virtual-network/)
- [Azure CLI Documentation](https://learn.microsoft.com/en-us/cli/azure/)
